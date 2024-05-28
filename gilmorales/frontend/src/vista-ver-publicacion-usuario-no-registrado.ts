import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ver-publicacion-usuario-no-registrado')
export class VistaVerPublicacionUsuarioNoRegistrado extends LitElement {
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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 100%; justify-content: center; flex-shrink: 0; scrollbar-color: transparent transparent; overflow-y: auto; height: 100%;">
 <vaadin-vertical-layout id="vaadinVerticalLayout2" style="flex-grow: 0; flex-shrink: 0; padding: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-top: 5%;">
  <vaadin-horizontal-layout id="video" style="flex-grow: 0; align-self: center; flex-shrink: 0; margin-left: var(--lumo-space-m); margin-top: var(--lumo-space-l);"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="layoutNumVisualizaciones" style="flex-shrink: 1;" theme="spacing-s">
   <label id="numVisualizaciones">0</label>
   <label id="label">Visualizaciones</label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing-xs" id="vaadinVerticalLayout3" style="flex-grow: 0; flex-shrink: 0; width: 30%; margin-left: var(--lumo-space-xl); padding: var(--lumo-space-m); padding-top: 5%;">
  <vaadin-vertical-layout id="vaadinVerticalLayout4" style="margin-left: var(--lumo-space-m); align-self: stretch;">
   <vaadin-horizontal-layout id="layoutUsuario" style="width: 100%;">
    <vaadin-avatar id="avatar" style="margin: var(--lumo-space-xs);"></vaadin-avatar>
    <vaadin-vertical-layout id="layoutVerPerfil" style="flex-shrink: 1; flex-grow: 0;">
     <vaadin-button theme="tertiary" id="verPerfil">
       NombreUsuario 
     </vaadin-button>
     <label id="geolocalizacion" style="width: 100%; flex-grow: 0; flex-shrink: 1;">Geolocalización</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="layoutLabels" style="width: 100%; justify-content: center;">
    <label id="descripcion" style="flex-grow: 1;">Descripcion de la publicacion...</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout id="layoutLabels" style="width: 100%; justify-content: space-around; align-self: center;">
    <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="flex-grow: 1; justify-content: flex-start; margin: var(--lumo-space-xs);" theme="spacing-s">
     <vaadin-horizontal-layout id="layoutLabels" style="flex-shrink: 1; margin: var(--lumo-space-s); flex-grow: 0; justify-content: center;">
      <label id="numMeGustas" style="flex-grow: 0; flex-shrink: 1; align-self: center; margin: var(--lumo-space-xs);">0</label>
      <label id="labelNumMeGustas" style="flex-grow: 0; margin: var(--lumo-space-xs);">NumMeGustas</label>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout id="layoutLabels" style="justify-content: center; flex-shrink: 1; margin: var(--lumo-space-xs); flex-grow: 0;" theme="spacing-xs">
      <label id="numComentarios" style="flex-grow: 0; align-self: center;">0</label>
      <vaadin-button theme="icon" aria-label="Add new" id="botonVerComentario" style="margin: var(--lumo-space-xs);">
       <iron-icon icon="lumo:plus" id="ironIcon2"></iron-icon>
      </vaadin-button>
     </vaadin-horizontal-layout>
    </vaadin-horizontal-layout>
    <label id="fechaSubida" style="flex-grow: 0; margin: var(--lumo-space-xs);">Fecha</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <hr style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout5" style="flex-grow: 1; width: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
