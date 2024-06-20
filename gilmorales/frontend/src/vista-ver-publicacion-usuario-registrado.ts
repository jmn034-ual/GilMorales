import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-ver-publicacion-usuario-registrado')
export class VistaVerPublicacionUsuarioRegistrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; margin: 0px; padding: 0px; justify-content: center; " id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="justify-content: center; align-items: center; flex-grow: 0; align-self: stretch; flex-shrink: 0; height: 100%;">
  <vaadin-vertical-layout id="vaadinVerticalLayout1" style="flex-grow: 1; align-self: stretch;">
   <vaadin-vertical-layout id="vaadinVerticalLayout2" style="flex-grow: 0; margin-bottom: var(--lumo-space-l); flex-shrink: 0; height: 100%; justify-content: flex-start; align-self: stretch; background-color: #000000;">
    <vaadin-horizontal-layout id="video" style="flex-grow: 0; width: 100%; margin-right: var(--lumo-space-m); align-items: center; flex-shrink: 0; justify-content: center; align-self: center; box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.3); height: 850px; overflow: hidden;"></vaadin-horizontal-layout>
    <vaadin-horizontal-layout id="layoutNumVisualizaciones" style="flex-shrink: 1; margin: var(--lumo-space-s); padding-bottom: 5%; padding-left: 5%; color: #ffffff;" theme="spacing-s">
     <label id="numVisualizaciones">0</label>
     <label id="label">Visualizaciones</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing-s" id="vaadinVerticalLayout3" style="flex-grow: 0; flex-shrink: 0; padding: 2%; height: 100%;">
   <vaadin-vertical-layout id="vaadinVerticalLayout4" style="width: 100%;">
    <vaadin-horizontal-layout id="layoutUsuario" style="width: 100%;">
     <vaadin-avatar id="avatar" style="margin: var(--lumo-space-xs);"></vaadin-avatar>
     <vaadin-vertical-layout id="layoutVerPerfil" style="flex-shrink: 1; flex-grow: 0;">
      <vaadin-button theme="tertiary" id="verPerfil">
        NombreUsuario 
      </vaadin-button>
      <label id="geolocalizacion" style="width: 100%; flex-grow: 0; flex-shrink: 1;">Geolocalización</label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout id="botones" style="flex-grow: 1; flex-direction: row; flex-shrink: 0; justify-content: flex-end;">
      <vaadin-button id="botonSeguir" style="align-self: center; margin: var(--lumo-space-xs);">
        Seguir 
      </vaadin-button>
      <vaadin-button id="botonDenunciar" style="align-self: center; margin: var(--lumo-space-xs);">
        Denunciar 
      </vaadin-button>
      <vaadin-button style="align-self: center; margin: var(--lumo-space-xs);" id="vaadinButton1">
        Eliminar 
      </vaadin-button>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="layoutLabels" style="width: 100%; justify-content: center;">
     <label id="descripcion" style="flex-grow: 1;">Descripcion de la publicacion...</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout id="layoutLabels" style="width: 100%; justify-content: space-around; align-self: center;">
     <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="flex-grow: 1; justify-content: flex-start;">
      <vaadin-horizontal-layout id="layoutLabels" style="flex-shrink: 1; margin: var(--lumo-space-xs); flex-grow: 0; justify-content: center;">
       <label id="numMeGustas" style="flex-grow: 0; flex-shrink: 1; align-self: center; margin: var(--lumo-space-xs);">0</label>
       <vaadin-button theme="icon" aria-label="Add new" id="botonMeGusta">
        <iron-icon icon="vaadin:heart-o" id="ironIcon"></iron-icon>
       </vaadin-button>
      </vaadin-horizontal-layout>
      <vaadin-horizontal-layout id="layoutLabels" style="justify-content: center; flex-shrink: 1; margin: var(--lumo-space-xs); flex-grow: 0;" theme="spacing-xs">
       <label id="numComentarios" style="flex-grow: 0; align-self: center;">0</label>
       <vaadin-button theme="icon" aria-label="Add new" id="botonVerComentario">
        <iron-icon icon="vaadin:comments-o" id="ironIcon2"></iron-icon>
       </vaadin-button>
      </vaadin-horizontal-layout>
     </vaadin-horizontal-layout>
     <label id="fechaSubida" style="flex-grow: 0; margin: var(--lumo-space-xs);">Fecha</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <hr style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout5" style="flex-grow: 0; width: 100%;"></vaadin-vertical-layout>
   <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="width: 100%; margin: var(--lumo-space-xs);" theme="spacing-s">
    <vaadin-text-field id="textComentario" style="flex-grow: 1;" placeholder="Escribe aqui tu comentario..."></vaadin-text-field>
    <vaadin-button id="botonComentar">
      Comentar 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
