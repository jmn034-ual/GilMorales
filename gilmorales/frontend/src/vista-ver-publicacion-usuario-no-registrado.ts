import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 100%; justify-content: center; flex-shrink: 0; scrollbar-color: transparent transparent; overflow-y: auto; height: 100%; align-items: center; margin: 0px; padding: 0px;">
 <vaadin-horizontal-layout style="justify-content: center; flex-grow: 1; flex-shrink: 0; height: 100%;">
  <vaadin-vertical-layout id="vaadinVerticalLayout2" style="flex-grow: 1; flex-shrink: 0; height: 100%; justify-content: flex-start; align-self: stretch; background-color: #000000;">
   <vaadin-horizontal-layout id="video" style="flex-grow: 0; width: 100%; margin-right: var(--lumo-space-m); align-items: center; flex-shrink: 0; justify-content: center; align-self: center; box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.3); height: 850px; overflow: hidden;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout id="layoutNumVisualizaciones" style="flex-shrink: 1; padding-bottom: 5%; padding-left: 5%; color: #ffffff;" theme="spacing-s">
    <label id="numVisualizaciones">0</label>
    <label id="label" style="color: #ffffff;">Visualizaciones</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-s" id="vaadinVerticalLayout3" style="flex-grow: 0; flex-shrink: 0; padding: 2%; width: 30%;">
   <vaadin-vertical-layout id="vaadinVerticalLayout4" style="margin-left: var(--lumo-space-m); align-self: stretch;">
    <vaadin-horizontal-layout id="layoutUsuario" style="width: 100%; padding-top: 5%;">
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
     <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="flex-grow: 1; justify-content: flex-start; margin: var(--lumo-space-xs); align-items: center;" theme="spacing-s">
      <vaadin-horizontal-layout id="layoutLabels" style="flex-shrink: 1; margin: var(--lumo-space-s); flex-grow: 0; justify-content: center;">
       <label id="numMeGustas" style="flex-grow: 0; flex-shrink: 1; align-self: center; margin: var(--lumo-space-xs);">0</label>
       <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton">
        <iron-icon icon="vaadin:heart-o" id="ironIcon"></iron-icon>
       </vaadin-button>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout id="layoutLabels" style="justify-content: center; flex-shrink: 1; margin: var(--lumo-space-xs); flex-grow: 0;" theme="spacing-xs">
       <label id="numComentarios" style="flex-grow: 0; align-self: center;">0</label>
       <vaadin-button theme="icon" aria-label="Add new" id="botonVerComentario" style="margin: var(--lumo-space-xs);">
        <iron-icon icon="vaadin:comments-o" id="ironIcon2"></iron-icon>
       </vaadin-button>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
     <label id="fechaSubida" style="flex-grow: 0; margin: var(--lumo-space-xs); padding-right: var(--lumo-space-m);">Fecha</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <hr style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout5" style="flex-grow: 1; width: 100%; align-self: center; align-items: center;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
