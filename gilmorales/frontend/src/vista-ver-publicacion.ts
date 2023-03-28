import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cabecera';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-ver-publicacion')
export class VistaVerPublicacion extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout" theme="spacing">
 <vaadin-horizontal-layout id="cabecera" style="width: 100%;">
  <vista-cabecera id="vistaCabecera" style="flex-grow: 1;"></vista-cabecera>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout id="vaadinVerticalLayout1" style="flex-grow: 1;">
   <vaadin-vertical-layout id="vaadinVerticalLayout2" style="flex-grow: 1; width: 100%;">
    <vaadin-horizontal-layout id="video" style="flex-grow: 1; width: 100%;"></vaadin-horizontal-layout>
    <vaadin-horizontal-layout id="layoutNumVisualizaciones" style="flex-shrink: 1;">
     <label id="numVisualizaciones">0</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="flex-grow: 1; margin: var(--lumo-space-xs);">
   <vaadin-vertical-layout id="vaadinVerticalLayout4" style="width: 100%;">
    <vaadin-horizontal-layout theme="spacing" id="layoutUsuario" style="width: 100%;">
     <vaadin-avatar id="avatar"></vaadin-avatar>
     <vaadin-vertical-layout id="layoutVerPerfil" style="flex-shrink: 0; justify-content: center;">
      <vaadin-button theme="tertiary" id="verPerfil">
       NombreUsuario
      </vaadin-button>
      <label id="geolocalizacion" style="width: 100%;">Label</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="layoutLabels" style="width: 100%; justify-content: center;">
     <label id="descripcion" style="flex-grow: 1;">Descripcion de la publicacion...</label>
     <label id="fechaSubida" style="flex-grow: 0; margin: var(--lumo-space-xs);">Label</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout id="layoutLabels" style="width: 100%; justify-content: center; align-self: center;">
     <vaadin-horizontal-layout id="layoutLabels" style="justify-content: center; flex-shrink: 1; margin: var(--lumo-space-xs); flex-grow: 1;">
      <label id="numMeGustas" style="flex-grow: 0; flex-shrink: 1; align-self: center; margin: var(--lumo-space-xs);">0</label>
      <label style="flex-grow: 0; align-self: center;" id="labelMeGusta">Me Gustas</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout id="layoutLabels" style="justify-content: center; flex-shrink: 1; margin: var(--lumo-space-xs); flex-grow: 1;">
      <label id="numComentarios" style="flex-grow: 0; align-self: center;">0</label>
      <vaadin-button theme="icon" aria-label="Add new" id="botonVerComentario">
       <iron-icon icon="lumo:plus"></iron-icon>
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout5" style="flex-grow: 1; width: 100%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
