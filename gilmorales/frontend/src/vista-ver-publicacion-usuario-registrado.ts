import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="flex-grow: 0; align-self: stretch; flex-shrink: 0; height: 100%;">
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="flex-grow: 1; align-self: stretch;">
  <vaadin-vertical-layout id="vaadinVerticalLayout2" style="flex-grow: 0; margin-bottom: var(--lumo-space-l); flex-shrink: 0; height: 100%; justify-content: flex-start; align-self: stretch; background-color: #000000;">
   <vaadin-horizontal-layout id="video" style="flex-grow: 0; width: 100%; margin-right: var(--lumo-space-m); align-items: center; flex-shrink: 0; justify-content: center; align-self: center; box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.3); height: 850px; overflow: hidden;"></vaadin-horizontal-layout>
   <vaadin-horizontal-layout id="layoutNumVisualizaciones" style="flex-shrink: 1; margin: var(--lumo-space-s); padding-bottom: 5%; padding-left: 5%; color: #ffffff;" theme="spacing-s">
    <label id="numVisualizaciones">0</label>
    <label id="label">Visualizaciones</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing-s" id="vaadinVerticalLayout3" style="flex-grow: 0; flex-shrink: 0; padding: 2%; height: 100%; width: 30%;">
  <vaadin-vertical-layout id="vaadinVerticalLayout4" style="border-radius: 10px; width: 100%; background-color: #F5F5F5; align-self: center; padding: var(--lumo-space-m); flex-shrink: 0; margin-top: var(--lumo-space-m);">
   <vaadin-horizontal-layout id="layoutUsuario" style="width: 100%;">
    <vaadin-avatar id="avatar" style="margin: var(--lumo-space-xs);"></vaadin-avatar>
    <vaadin-vertical-layout id="layoutVerPerfil" style="flex-shrink: 1; flex-grow: 0;">
     <vaadin-button theme="tertiary" id="verPerfil" style="color: black; font-weight: bold;">
       NombreUsuario 
     </vaadin-button>
     <label id="geolocalizacion" style="width: 100%; flex-grow: 0; flex-shrink: 1;">Geolocalización</label>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout id="botones" style="flex-grow: 1; flex-direction: row; flex-shrink: 0; justify-content: flex-end;">
     <vaadin-button id="botonSeguir" style="align-self: center; margin: var(--lumo-space-xs);">
       Seguir 
     </vaadin-button>
     <vaadin-button id="botonDenunciar" style="align-self: center; margin: var(--lumo-space-xs);" theme="primary error">
       Denunciar 
     </vaadin-button>
     <vaadin-button style="align-self: center; margin: var(--lumo-space-xs);" id="vaadinButton1" theme="primary error">
       Eliminar 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <label id="descripcion" style="flex-grow: 1;">Descripcion de la publicacion...</label>
   <label id="fechaSubida" style="flex-grow: 0; margin: 0px; align-self: flex-end; padding: 0px; flex-grow: 0; margin: var(--lumo-space-xs); padding-right: var(--lumo-space-m); font-weight: bold;">Fecha</label>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="flex-grow: 0; justify-content: center; flex-shrink: 0; width: 100%;" theme="spacing-l">
   <vaadin-horizontal-layout id="layoutLabels" style="flex-shrink: 0; flex-grow: 0; justify-content: center;" theme="spacing">
    <label id="numMeGustas" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold; flex-shrink: 1;">0</label>
    <vaadin-button theme="icon large" aria-label="Add new" id="botonMeGusta" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px; color: red;"></vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout id="layoutLabels" style="justify-content: center; flex-shrink: 1; flex-grow: 0;" theme="spacing">
    <label id="numComentarios" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; padding: var(--lumo-space-s); width: 20px; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; height: 20px; justify-content: center; font-weight: bold;">0</label>
    <vaadin-button theme="icon" aria-label="Add new" id="botonVerComentario" style="align-self: center; border-radius: 100px; border: 2px solid #F5F5F5; /* Ajusta la altura y el ancho para que sean iguales */
height: 100px; display: flex; /* Asegura que el contenido esté centrado si es necesario */
justify-content: center; align-items: center; justify-content: center; font-weight: bold; width: 50px; height: 50px; padding: 0px;">
     <iron-icon icon="vaadin:comments" id="ironIcon2" style="height: 30px; width: 30px; color: black; align-self: center;"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <hr style="width: 100%;" id="hr">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout5" style="width: 90%; border-radius: 10px; border: 2px solid #F5F5F5; align-self: center; justify-content: center;"></vaadin-vertical-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="margin: var(--lumo-space-xs); align-self: center; flex-shrink: 0; width: 100%;" theme="spacing-s">
   <vaadin-text-field id="textComentario" style="flex-grow: 1;" placeholder="Escribe aqui tu comentario..."></vaadin-text-field>
   <vaadin-button id="botonComentar" theme="primary">
     Comentar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
